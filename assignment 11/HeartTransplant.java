/*************************************************************************
 *  Compilation:  javac HeartTransplant.java
 *  Execution:    java HeartTransplant < data.txt
 *
 *  @author: Madiha Abdul Maajid, maa525, maa525@scarletmail.rutgers.edu
 *
 *************************************************************************/

public class HeartTransplant {

    /* ------ Instance variables  -------- */

    // Person array, each Person is read from the data file
    private Person[] listOfPatients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge[] survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause[] survivabilityByCause;

    /* ------ Constructor  -------- */
    
    /*
     * Initializes all instance variables to null.
     */
    public HeartTransplant() {
        
        // WRITE YOUR CODE HERE
        listOfPatients = null;
        survivabilityByAge = null;
        survivabilityByCause = null;
    }

    /* ------ Methods  -------- */

    /*
     * Inserts Person p into listOfPatients
     * 
     * Returns:  0 if successfully inserts p into array, 
     *          -1 if there is not enough space to insert p into array
     */
    public int addPerson(Person p, int arrayIndex) {

        // WRITE YOUR CODE HERE
        if (arrayIndex > (listOfPatients.length - 1)){
            return -1;
        } else{
            listOfPatients[arrayIndex] = p;
            return 0;
        }
    }

    /*
     * 1) Creates the listOfPatients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file.
     *    File Format: ID, Ethinicity, Gender, Age, Cause, Urgency, State of health
     *    Each line refers to one Person.
     * 
     * 3) Inserts each person from file into listOfPatients
     *    Hint: uses addPerson() method
     * 
     * Returns the number of patients read from file
     */
    public int readPersonsFromFile(int numberOfLines) {

        // WRITE YOUR CODE HERE
        listOfPatients = new Person[numberOfLines];

        for(int i = 0; i < numberOfLines; i++) {
            Person newPerson = new Person (StdIn.readInt(), 
            StdIn.readInt(),
            StdIn.readInt(),
            StdIn.readInt(),
            StdIn.readInt(),
            StdIn.readInt(),
            StdIn.readInt());
            addPerson(newPerson,i);
        }
        return listOfPatients.length;
    }

    /*
     * 1) Creates the survivabilityByAge array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     * 3) Inserts each rate from file into the survivabilityByAge array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByAgeFromFile (int numberOfLines) {

        // WRITE YOUR CODE HERE
        survivabilityByAge = new SurvivabilityByAge[numberOfLines];
        for(int j = 0; j < numberOfLines; j++) {
            SurvivabilityByAge surviveAgeStat = new SurvivabilityByAge(StdIn.readInt(),
            StdIn.readInt(),
            StdIn.readDouble());
            survivabilityByAge[j] = surviveAgeStat;
        }
        return survivabilityByAge.length;
    }

    /*
     * 1) Creates the survivabilityByCause array with numberOfLines length.
     * 
     * 2) Reads from the command line file.
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     * 3) Inserts each rate from file into the survivabilityByCause array
     * 
     * Returns the number of survivabilities rates read from file
     */
    public int readSurvivabilityRateByCauseFromFile (int numberOfLines) {

        // WRITE YOUR CODE HERE
        survivabilityByCause = new SurvivabilityByCause[numberOfLines];
        for(int n = 0; n < numberOfLines; n++) {
            SurvivabilityByCause surviveCauseStat = new SurvivabilityByCause(StdIn.readInt(),
            StdIn.readInt(),
            StdIn.readDouble());
            survivabilityByCause[n] = surviveCauseStat;
        }
        return survivabilityByCause.length;
    }

    /*
     * Returns listOfPatients
     */
    public Person[] getListOfPatients() {
        return listOfPatients;
    } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge[] getSurvivabilityByAge() {
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause[] getSurvivabilityByCause() {
        return survivabilityByCause;
    }

    /*
     * Returns a Person array in which with every Person that has 
     * age above the parameter age from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with age above the parameter age.
     * 
     * Return null if there is no Person with age above the 
     * parameter age.
     */ 
    public Person[] getPatientsWithAgeAbove(int age) {

        // WRITE YOUR CODE HERE
        int ageReqMet = 0;

        for (int i = 0; i < (listOfPatients.length); i++){
            Person patient = listOfPatients[i];
            if (patient.getAge() > age) 
            {
                ageReqMet++;
            }
        }
        
        Person[] PatientsWithAgeAbove = new Person[ageReqMet];
        if (ageReqMet == 0) {
            return null;
        }

        int pNum = 0;


        for(int i=0; i<(listOfPatients.length); i++){
            Person patient = listOfPatients[i];
            if (patient.getAge() > age){
                PatientsWithAgeAbove[pNum] = patient;
                pNum++;
            }
        }
        return PatientsWithAgeAbove;
    }
    
    /*
     * Returns a Person array with every Person that has the state of health 
     * equal to the parameter state from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the state of health equal to the parameter state.
     * 
     * Return null if there is no Person with the state of health 
     * equal to the parameter state.
     */ 
    public Person[] getPatientsByStateOfHealth(int state) {

        // WRITE YOUR CODE HERE
        int patientState = 0;
        for(int i = 0; i < listOfPatients.length; i++) {
            Person patient = listOfPatients[i];
            if (patient.getStateOfHealth() == state) {
                patientState++;
            }
        }
            if (patientState == 0) {
                return null;
            }
            int pNum = 0;
            Person[] PatientsByStateOfHealth = new Person[patientState];

            for (int i = 0; i < listOfPatients.length; i++) {
                Person patient = listOfPatients[i];
                if (patient.getStateOfHealth() == state) {
                    PatientsByStateOfHealth[pNum] = patient;
                    pNum = pNum + 1;
                }
            }
        return PatientsByStateOfHealth;
    }

    /*
     * Returns a Person array with every person that has the heart 
     * condition cause equal to the parameter cause from the listOfPatients array.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of persons with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Person with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Person[] getPatientsByHeartConditionCause(int cause) {

        // WRITE YOUR CODE HERE
        int heartCause = 0;
        for(int i = 0; i < listOfPatients.length; i++){
            Person patient  = listOfPatients[i];
            if(patient.getCause() == cause) {
                heartCause++;
            }
        }
            if(heartCause == 0) {
                return null;
            }
            Person[] PatientsByHeartConditionCause = new Person[heartCause];
            int pNum = 0;
            for (int i = 0; i < listOfPatients.length; i++) {
                Person patient = listOfPatients[i];
                if(patient.getCause() == cause) {
                    PatientsByHeartConditionCause[pNum] = patient;
                    pNum++;
                }
            }
        return PatientsByHeartConditionCause;
    }

    /*
     * Assume there are numberOfHearts available for transplantation surgery.
     * Also assume that the hearts are of the same blood type as the
     * persons on the listOfPatients.
     * This method finds a set of persons to be the recepients of these
     * hearts.
     * 
     * The method returns a Person array from the listOfPatients
     * array that have the highest potential for survivability after
     * the transplant. The array size is numberOfHearts.
     * 
     * If numberOfHeartsAvailable is greater than listOfPatients
     * array size all Persons will receive a transplant.
     * 
     * If numberOfHeartsAvailable is smaller than listOfPatients
     * array size find the set of people with the highest
     * potential for survivability.
     * 
     * There is no correct solution, you may come up with any set of
     * persons from the listOfPatients array.
     */ 
    public Person[] match(int numberOfHearts) {

        // WRITE YOUR CODE HERE
        Person[] patients = new Person[numberOfHearts];
        int numberOfHeartsAvailable = numberOfHearts;
        Person[] patientsEligible = ageSort(); // using age survivability to determine heart transplants

        if(numberOfHearts > listOfPatients.length) {
            return patientsEligible;
        }
        for(int i = 0; i < numberOfHeartsAvailable; i++) {
            patients[i] = patientsEligible[i];
        }
        return patients;

    }

    public int idealAge() { // determines ideal age for transplant according to survivability by age
        double surviveRate = 0;
        int age = 0;
        for(int i = 0; i < survivabilityByAge.length; i++){
            SurvivabilityByAge ros = survivabilityByAge[i]; // ros = rate of survivability
            if(ros.getYears() == 3){
                if(ros.getRate() > surviveRate) {
                    surviveRate = ros.getRate();
                    age = ros.getAge();
                }
            }
        }
        return age;
    }

    public Person[] ageSort() { // sorts array to ideal age for transplant
        int age = idealAge();
        
        Person n = listOfPatients[0];
        boolean order = false;



        Person [] listSortedByAge = listOfPatients;

        while(!order) {
            order = true;
            for (int i = 0; i < listSortedByAge.length-1; i++) {

                if (Math.abs(age-listSortedByAge[i+1].getAge()) < Math.abs(age-listSortedByAge[i].getAge())) {
                    n = listSortedByAge[i];
                    listSortedByAge[i] = listSortedByAge[i+1];
                    listSortedByAge[i+1] = n;
                    order = false;
                }
            }
        }
        return listSortedByAge;
    }

    /*
     * Client to test the methods you write
     */
    public static void main (String[] args) {

        HeartTransplant ht = new HeartTransplant();

        // read persons from file
        int numberOfLines = StdIn.readInt();
        int numberOfReadings = ht.readPersonsFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " patients read from file.");
 
        // read survivability by age from file
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByAgeFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by age lines read from file.");

        // read survivability by heart condition cause from file        
        numberOfLines = StdIn.readInt();
        numberOfReadings = ht.readSurvivabilityRateByCauseFromFile(numberOfLines);
        StdOut.println(numberOfReadings + " survivability rates by cause lines read from file.");

        // list all patients
        for (Person p : ht.getListOfPatients()) {
            StdOut.println(p);
        }

        // list survivability by age rates
        for (SurvivabilityByAge rate : ht.getSurvivabilityByAge()) {
            StdOut.println(rate);
        }

        // list survivability by cause rates
        for (SurvivabilityByCause rate : ht.getSurvivabilityByCause()) {
            StdOut.println(rate);
        }

        int numberOfHearts = 7;
        StdOut.println("Patients for transplant: ");
        for (Person p : ht.match(numberOfHearts)){
            StdOut.println(p);
        }

    }
}