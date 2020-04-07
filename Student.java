class Student {
	String index;
	String firstName;
	String lastName;
        List<Integer> labPoints;
	  //TODO constructor

    public Student(String firstName, String index, String lastName, List<Integer> labPoints) {
        this.firstName = firstName;
        this.index = index;
        this.lastName = lastName;
        this.labPoints = labPoints;
    }


//TODO seters & getters


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLabPoints(List<Integer> labPoints) {
        this.labPoints = labPoints;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getIndex() {
        return index;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getLabPoints() {
        return labPoints;
    }

     public double getAverage() {
        //TODO
         int sum = 0;
         for (int i : labPoints) {
             sum+=i;
         }

         return sum/(float)labPoints.size();

    }

   public boolean hasSignature() {
        //TODO
       if(labPoints.size()>8) {
           return true;
       }
       else
       {
           return false;
       }


   }
static class Course
{
    List<Student> lista=new ArrayList<>();
    int poeni;

    public Course(int poeni) {
        this.poeni =poeni;
    }

    public Course(List<Student> lista) {
        this.lista = lista;
    }

    public boolean daliPolozil()
    {
        if(poeni>=51)
        {
            return true;

        }
        else
        {
            return false;

        }
    }
}
