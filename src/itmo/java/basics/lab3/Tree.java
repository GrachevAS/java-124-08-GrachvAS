package itmo.java.basics.lab3;

public class Tree {
    private String treeName;
    private int treeAge;
    private boolean isAlive;

    public Tree (){
        System.out.println("Пустой конструктор без параметров сработал");
    };

    public Tree (int treeAge, String treeName){
        this.treeAge = treeAge;
        this.treeName = treeName;
    }

    public Tree (String treeName, int treeAge, boolean isAlive){
        this.treeName = treeName;
        this.treeAge = treeAge;
        this.isAlive = isAlive;
    }

    public String getTreeName() {
        return treeName;
    }

    public int getTreeAge() {
        return treeAge;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "treeName='" + treeName + '\'' +
                ", treeAge=" + treeAge +
                ", isAlive=" + isAlive +
                '}';
    }
}
