package fr.morgan.commandecadeau.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Article.
 */
@Entity
@Table(name = "article")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "designation")
    private String designation;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "nb_points")
    private Integer nbPoints;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "categorie")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<Categorie> categories = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public Article designation(String designation) {
        this.designation = designation;
        return this;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getStock() {
        return stock;
    }

    public Article stock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getNbPoints() {
        return nbPoints;
    }

    public Article nbPoints(Integer nbPoints) {
        this.nbPoints = nbPoints;
        return this;
    }

    public void setNbPoints(Integer nbPoints) {
        this.nbPoints = nbPoints;
    }

    public String getDescription() {
        return description;
    }

    public Article description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Categorie> getCategories() {
        return categories;
    }

    public Article categories(Set<Categorie> categories) {
        this.categories = categories;
        return this;
    }

    public Article addCategorie(Categorie categorie) {
        this.categories.add(categorie);
        categorie.setCategorie(this);
        return this;
    }

    public Article removeCategorie(Categorie categorie) {
        this.categories.remove(categorie);
        categorie.setCategorie(null);
        return this;
    }

    public void setCategories(Set<Categorie> categories) {
        this.categories = categories;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Article)) {
            return false;
        }
        return id != null && id.equals(((Article) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Article{" +
            "id=" + getId() +
            ", designation='" + getDesignation() + "'" +
            ", stock=" + getStock() +
            ", nbPoints=" + getNbPoints() +
            ", description='" + getDescription() + "'" +
            "}";
    }
}
