package org.example;

public class Child {
    private int childId;
    private String childName;
    private String deficiencyIn;

    public int getChildId() {
        return childId;
    }
    public void setChildId(int childId) {
        this.childId = childId;
    }
    public String getChildName() {
        return childName;
    }
    public void setChildName(String childName) {
        this.childName = childName;
    }
    public String getDeficiencyIn() {
        return deficiencyIn;
    }
    public void setDeficiencyIn(String deficiencyIn) {
        this.deficiencyIn = deficiencyIn;
    }

    public Child(int childId, String childName, String deficiencyIn){
        super();
        this.childId = childId;
        this.childName = childName;
        this.deficiencyIn = deficiencyIn;
    }
    public Child() {
        super();
    }

    @Override
    public String toString() {
        return "Child{" +
                "childId=" + childId +
                ", childName='" + childName + '\'' +
                ", deficiencyIn='" + deficiencyIn + '\'' +
                '}';
    }
}
