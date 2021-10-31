package ru.mirea.java.practice12_15;

public class Shirt {
    String shirtInString, vendorСode, name, color, size;

    public Shirt(String shirtInString) {
        this.shirtInString = shirtInString;

        fromStringToShirt();
    }

    public void fromStringToShirt(){
        String[] separatedSpecifications = shirtInString.split(",");

        for (int i = 0; i < 4; i++){
            switch(i){
                case 0:
                    vendorСode = separatedSpecifications[0];
                    break;
                case 1:
                    name = separatedSpecifications[1];
                    break;
                case 2:
                    color = separatedSpecifications[2];
                    break;
                case 3:
                    size = separatedSpecifications[3];
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return "\nФутболка" +
                "\nАртикул='" + vendorСode + '\'' +
                ", \nНаименование='" + name + '\'' +
                ", \nЦвет='" + color + '\'' +
                ", \nРазмер='" + size + '\'';
    }
}
