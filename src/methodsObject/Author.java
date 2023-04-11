package methodsObject;

import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(getNameAuthor(), author.getNameAuthor()) && Objects.equals(getSurnameAuthor(), author.getSurnameAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameAuthor(), getSurnameAuthor());
    }

    @Override
    public String toString() {
        return nameAuthor + surnameAuthor;
    }
    public String getNameAuthor () {
        return this.nameAuthor;
    }
    public String getSurnameAuthor () {
        return this.surnameAuthor;
    }
}
