package footballclub;

public class FootballPlayer {
    private String idPlayer;
    private String position;
    private int goal;
    private int assist;
    private int tackle;
    private int weight;


    public FootballPlayer(){}

    public FootballPlayer(String idPlayer, String position, int goal, int assist, int tackle, int weight) {
        this.idPlayer = idPlayer;
        this.position = position;
        this.goal = goal;
        this.assist = assist;
        this.tackle = tackle;
        this.weight = weight;
    }

    public String getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(String idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getAssist() {
        return assist;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public int getTackle() {
        return tackle;
    }

    public void setTackle(int tackle) {
        this.tackle = tackle;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "idPlayer='" + idPlayer + '\'' +
                ", position='" + position + '\'' +
                ", goal=" + goal +
                ", assist=" + assist +
                ", tackle=" + tackle +
                ", weight=" + weight +
                '}';
    }
}
