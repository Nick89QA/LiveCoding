package interfaceAbstract2;

public abstract class Proffesion {

    public Proffesion(String professionName, String industry) {
        this.professionName = professionName;
        this.industry = industry;
    }

    String professionName;
    String industry;



    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }



 public abstract void doJob();

}
