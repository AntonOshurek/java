package com.javalesson.oop;

public class Dog {
    private static int dogsCount;
    private int paws = 4;
    private int tail = 1;
    private String name;
    private String breed;
    private String size;

    public Dog() {
        dogsCount++;
    }

    private boolean validateSize(String size) {
        if (size.equalsIgnoreCase("Big") ||
                size.equalsIgnoreCase("Small") ||
                size.equalsIgnoreCase("Average")) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDogsCount() {
        return dogsCount;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (this.validateSize(size)) {
            this.size = size;
        } else {
            System.out.println("sise should be on of these: Big, Average or Small.");
        }

        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        if (("Big").equalsIgnoreCase((this.size))) {
            System.out.println("Wof - Wof!");
        } else if(("Average").equalsIgnoreCase(this.size)) {
            System.out.println("Raf - Raf!");
        } else if (("Small").equalsIgnoreCase(this.size)) {
            System.out.println("Tiaf - tiaf!");
        }
    }

    public void bite() {
        if(dogsCount > 3) {
            System.out.println("кусь кусь нас больше чем 3 собаки в этом класе!");
        } else {
            this.bark();
        }
    }

}
