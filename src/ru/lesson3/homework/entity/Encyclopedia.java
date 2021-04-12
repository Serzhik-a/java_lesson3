package ru.lesson3.homework.entity;

import ru.lesson3.homework.BookActions;

public class Encyclopedia extends Book implements BookActions {

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
        return "Encyclopedia{" +
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

    public void showClass () {
        System.out.println("Книга " + this.title + " относится к классу " + this.getClass().getSimpleName());
    }

    public void readPageBook(Integer page) {
        System.out.println("Прочитайте " + page + " страницу из книги \"" + this.title + "\"");
    }

////////////////////////Builder//////////////////////////////

    public static class Builder {
        private Encyclopedia newEncyclopedia;

        public Builder() {
            newEncyclopedia = new Encyclopedia();
        }

        public Builder setCode(String code) {
            newEncyclopedia.code = code;
            return this;
        }

        public Builder setAuthor(String autor) {
            newEncyclopedia.autor = autor;
            return this;
        }

        public Builder setTitle(String title) {
            newEncyclopedia.title = title;
            return this;
        }

        public Builder setYear(Integer year) {
            newEncyclopedia.year = year;
            return this;
        }

        public Builder setPublishingHouse(String publishingHouse) {
            newEncyclopedia.publishingHouse = publishingHouse;
            return this;
        }

        public Encyclopedia build() {
            return newEncyclopedia;
        }

    }
}
