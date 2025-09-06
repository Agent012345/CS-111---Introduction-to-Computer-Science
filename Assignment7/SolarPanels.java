
/**
 * Class represents solar panels, street map, and
 * an array of parking lot projects.
 *
 * @author Jessica De Brito
 * @author Kal Pandit
 */
public class SolarPanels {

    private Panel[][] panels;
    private String[][] streetMap;
    private ParkingLot[] lots;

    /**
     * Default constructor: initializes empty panels and objects.
     */
    public SolarPanels() {
        panels = null;
        streetMap = null;
        lots = null;
        StdRandom.setSeed(2023);
    }

    /**
     * Updates the instance variable streetMap to be an l x w array of Strings.
     * Reads each label from input file in parameters.
     *
     * @param streetMapFile the input file to read from
     */
    public void setupStreetMap(String streetMapFile) {
        StdIn.setFile(streetMapFile);
        int l = StdIn.readInt();
        int w = StdIn.readInt();
        streetMap = new String[l][w];
        for (int i = 0; i < streetMap.length; i++) {
            for (int j = 0; j < streetMap[i].length; j++) {
                streetMap[i][j] = StdIn.readString();
            }
        }
    }

    /**
     * Adds parking lot information to an array of parking lots. Updates the
     * instance variable lots to store these parking lots.
     *
     * @param parkingLotFile the lot input file to read
     */
    public void setupParkingLots(String parkingLotFile) {
        StdIn.setFile(parkingLotFile);
        int n = StdIn.readInt();
        lots = new ParkingLot[n];
        for (int i = 0; i < lots.length; i++) {
            String lotName = StdIn.readString();
            int maxPanels = StdIn.readInt();
            double budget = StdIn.readDouble();
            int energyCapacity = StdIn.readInt();
            double panelEfficiency = StdIn.readDouble();
            ParkingLot allValues = new ParkingLot(lotName, maxPanels, budget, energyCapacity, panelEfficiency);
            lots[i] = (allValues);
        }
    }

    /**
     * Insert panels on each lot as much as space and budget allows. Updates the
     * instance variable panels to be a 2D array parallel to streetMap, storing
     * panels placed.
     * <p>
     * Panels have a 95% chance of working. Use StdRandom.uniform(); if the
     * resulting value is < 0.95 the panel works.
     *
     * @param costPerPanel the fixed cost per panel, as a double
     */
    public void insertPanels(double costPerPanel) {
        panels = new Panel[streetMap.length][streetMap[0].length];
        for (int i = 0; i < lots.length; i++) {
            int numOfPanels = 0;
            String lotName = lots[i].getLotName();
            int maxPanels = lots[i].getMaxPanels();
            double budget = lots[i].getBudget();
            int workingPanelCount = 0;

            for (int j = 0; j < streetMap.length; j++) {
                for (int k = 0; k < streetMap[j].length; k++) {
                    if ((streetMap[j][k].equals(lotName)) && (budget >= costPerPanel) && (numOfPanels < maxPanels)) {
                        budget = budget - costPerPanel;
                        numOfPanels = numOfPanels + 1;
                        int maxOutput = lots[i].getEnergyCapacity();
                        double ratedEfficiency = lots[i].getPanelEfficiency();
                        double work = StdRandom.uniform();
                        boolean isWorking;
                        isWorking = work < 0.95;
                        Panel allValues = new Panel(ratedEfficiency, maxOutput, isWorking);
                        panels[j][k] = allValues;
                        if (isWorking) {
                            workingPanelCount++;
                        }
                    }
                }
            }
            lots[i].setMaxPanels(workingPanelCount);
        }
    }

    /**
     * Given a temperature and coefficient, update panels' actual efficiency
     * values. Panels are most optimal at 77 degrees F.
     * <p>
     * Panels perform worse in hotter environments and better in colder ones.
     * worse = efficiency loss, better = efficiency gain.
     * <p>
     * Coefficients are usually negative to represent energy loss.
     *
     * @param temperature the current temperature, in degrees F
     * @param coefficient the coefficient to use
     */
    public void updateActualEfficiency(int temperature, double coefficient) {
        for (int i = 0; i < panels.length; i++) {
            for (int j = 0; j < panels[i].length; j++) {
                if (null != panels[i][j]) {
                    double ratedEfficiency = panels[i][j].getRatedEfficiency();
                    if (temperature <= 77) {
                        double efficiencyGain = coefficient * (temperature - 77);
                        double actualEfficiency = ratedEfficiency + efficiencyGain;
                        panels[i][j].setActualEfficiency(actualEfficiency);
                    } else {
                        double efficiencyLoss = coefficient * (temperature - 77);
                        double actualEfficiency = ratedEfficiency - efficiencyLoss;
                        panels[i][j].setActualEfficiency(actualEfficiency);
                    }
                }
            }
        }
    }

    /**
     * For each WORKING panel, update the electricity generated for 4 hours of
     * sunlight as follows:
     * <p>
     * (actual efficiency / 100) * 1500 * 4
     * <p>
     * RUN updateActualEfficiency BEFORE running this method.
     */
    public void updateElectricityGenerated() {
        for (int i = 0; i < panels.length; i++) {
            for (int j = 0; j < panels[i].length; j++) {
                if ((null != panels[i][j]) && (panels[i][j].isWorking())) {
                    double actualEfficiency = panels[i][j].getActualEfficiency();
                    int electricityGenerated = (int) ((actualEfficiency / 100) * 1500 * 4);
                    panels[i][j].setElectricityGenerated(electricityGenerated);
                }
            }
        }
    }

    /**
     * Count the number of working panels in a parking lot.
     *
     * @param parkingLot the parking lot name
     * @return the number of working panels
     */
    public int countWorkingPanels(String parkingLot) {
        int count = 0;
        for (int i = 0; i < lots.length; i++) {
            if (lots[i].getLotName().equals(parkingLot)) {
                count = lots[i].getMaxPanels();
                break;
            }
        }
        return count; // PLACEHOLDER TO AVOID COMPILATION ERROR - REPLACE WITH YOUR CODE
    }

    /**
     * Find the broken panels in the map and repair them.
     *
     * @return the count of working panels in total, after repair
     */
    public int updateWorkingPanels() {
        int count = 0;
        for (int i = 0; i < panels.length; i++) {
            for (int j = 0; j < panels[i].length; j++) {
                if ((null != panels[i][j])) {
                    if (!panels[i][j].isWorking()) {
                        panels[i][j].setIsWorking(true);
                    }
                    count++;
                }
            }
        }
        return count; // PLACEHOLDER TO AVOID COMPILATION ERROR - REPLACE WITH YOUR CODE
    }

    /**
     * Calculate Rutgers' savings on energy by using these solar panels.
     * <p>
     * ASSUME: - Multiply total electricity generated by 0.001 to convert to
     * KwH. - There are 365 days in a year.
     * <p>
     * RUN electricityGenerated before running this method.
     */
    public double calculateSavings() {
        int electricityGenerated = 0;
        for (int i = 0; i < panels.length; i++) {
            for (int j = 0; j < panels[i].length; j++) {
                if ((null != panels[i][j])) {
                    electricityGenerated = electricityGenerated + panels[i][j].getElectricityGenerated();
                }
            }
        }
        double savings = (((electricityGenerated * 0.001) * 365) / 4270000) * 60000000;
        return savings; // PLACEHOLDER TO AVOID COMPILATION ERROR - REPLACE WITH YOUR CODE
    }

    /*
     * Getter and Setter methods
     */
    public Panel[][] getPanels() {
        // DO NOT TOUCH THIS METHOD
        return this.panels;
    }

    public void setPanels(Panel[][] panels) {
        // DO NOT TOUCH THIS METHOD
        this.panels = panels;
    }

    public String[][] getStreetMap() {
        // DO NOT TOUCH THIS METHOD
        return this.streetMap;
    }

    public void setStreetMap(String[][] streetMap) {
        // DO NOT TOUCH THIS METHOD
        this.streetMap = streetMap;
    }

    public ParkingLot[] getLots() {
        // DO NOT TOUCH THIS METHOD
        return this.lots;
    }

    public void setLots(ParkingLot[] lots) {
        // DO NOT TOUCH THIS METHOD
        this.lots = lots;
    }
}
