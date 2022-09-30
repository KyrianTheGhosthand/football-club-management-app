package footballclub;

public class Coach {
    private String coachtype;
    private String idCoach;
    private int experience;

    public Coach(){}

    public Coach(String coachtype, String idCoach, int experience) {
        this.coachtype = coachtype;
        this.idCoach = idCoach;
        this.experience = experience;
    }

    public String getCoachtype() {
        return coachtype;
    }

    public void setCoachtype(String coachtype) {
        this.coachtype = coachtype;
    }

    public String getIdCoach() {
        return idCoach;
    }

    public void setIdCoach(String idCoach) {
        this.idCoach = idCoach;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "coachtype='" + coachtype + '\'' +
                ", idCoach='" + idCoach + '\'' +
                ", experience=" + experience +
                '}';
    }
}
