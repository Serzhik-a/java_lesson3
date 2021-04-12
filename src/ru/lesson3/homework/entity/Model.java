package ru.lesson3.homework.entity;

import ru.lesson3.homework.PhoneActions;
import ru.lesson3.homework.PhoneClasses;

public class Model extends SiemensMobile implements PhoneActions {

    private String modelCode;

    public Integer getPrice() {
        return this.price;
    }

    public String getVendor() {
        return this.vendor;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void showInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Model{" +
                "vendor='" + vendor + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", modelCode='" + modelCode + '\'' +
                ", class=" + phoneClass +
                '}';
    }

    public void showClass() {
        System.out.println("Телефон " + this.vendor + " относится к классу " + this.getClass().getSimpleName());
    }

    ////////////////////////Builder//////////////////////////////

    public static class Builder {
        private Model newModel;

        public Builder() {
            newModel = new Model();
        }

        public Builder setVendor(String vendor) {
            newModel.vendor = vendor;
            return this;
        }

        public Builder setWeight(Integer weight) {
            newModel.weight = weight;
            return this;
        }

        public Builder setPrice(Integer price) {
            newModel.price = price;
            return this;
        }

        public Builder setClass(PhoneClasses phoneClasses) {
            newModel.phoneClass = phoneClasses;
            return this;
        }

        public Builder setModelCode(String modelCode) {
            newModel.modelCode = modelCode;
            return this;
        }

        public Model build() {
            return newModel;
        }

    }
}