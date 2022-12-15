package Abstract;

public abstract class Plants {
    private String name;
    private int height;

    public String getName(){return this.name;} //получить имя
    public void setName(String name){this.name = name;} //добавить имя
    public int getHeight(){return this.height;} //получить рост
    public void setHeight(int height){this.height = height;} //добавить рост

    @Override
    public String toString(){
        return getName() + " — рост: " + getHeight();
    }
}
