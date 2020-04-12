class Student {
	String index;
	String firstName;
	String lastName;
	Int[] labPoints;

	//TODO constructor
    public Student(String i, String f, Student l, Int[] labP) {
        index = i;
        firstName = f;
        lastName = l;
        labPoints = labP;
    }

	//TODO seters & getters
    public void setName(String newName) {
        this.firstName = newName;
    }
    
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    
    public void setIndex(String newIndex) {
        this.index = newIndex;
    }
    
    public void setLabPoints(Int[] newLabPoints) {
        this.labPoints = newLabPoints;
    }
    
    public String getIndex() {
        return index;
    }
    
    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Int[] getLabPoints() {
        return labPoints;
    }
    
	public double getAverage() {
        double total = 0;
        for(int i=0; i<labPoints.length; i++){
            total = total + arr[i];
        }
        double average = total / arr.length;
        return average
	}

	public boolean hasSignature() {
        return labPoints.size()>8;
	}
}
