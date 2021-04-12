package ru.lesson3.homework.entity;


import ru.lesson3.homework.BookActions;

public class ReferenceBook extends Book implements BookActions {

    public String getCode() {
        return this.code;
    }

    public String getAuthor() {
        return this.autor;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getYear() {
        return this.year;
    }

    public String getPublishingHouse() {
        return this.publishingHouse;
    }

    @Override
    public String toString() {
        return "ReferenceBook{" +
                "code='" + code + '\'' +
                ", autor='" + autor + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }

    public void showInfo() {
        System.out.println(toString());

    }

    public void showClass() {
        System.out.println("Книга " + this.title + " относится к классу " + this.getClass().getSimpleName());
    }

    public void readPageBook(Integer page) {
        System.out.println("Прочитайте " + page + " страницу из книги \"" + this.title + "\"");
    }

    ////////////////////////Builder//////////////////////////////

    public static class Builder {
        private ReferenceBook newReferenceBook;

        public Builder() {
            newReferenceBook = new ReferenceBook();
        }

        public Builder setCode(String code) {
            newReferenceBook.code = code;
            return this;
        }

        public Builder setAuthor(String autor) {
            newReferenceBook.autor = autor;
            return this;
        }

        public Builder setTitle(String title) {
            newReferenceBook.title = title;
            return this;
        }

        public Builder setYear(Integer year) {
            newReferenceBook.year = year;
            return this;
        }

        public Builder setPublishingHouse(String publishingHouse) {
            newReferenceBook.publishingHouse = publishingHouse;
            return this;
        }

        public ReferenceBook build() {
            return newReferenceBook;
        }

    }
}
