package fr.morgan.commandecadeau.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A Categorie.
 */
@Entity
@Table(name = "categorie")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Categorie implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @ManyToOne
    @JsonIgnoreProperties(value = "categories", allowSetters = true)
    private Article categorie;

    @ManyToOne
    @JsonIgnoreProperties(value = "categories", allowSetters = true)
    private Article categorie;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public Categorie nom(String nom) {
        this.nom = nom;
        return this;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Article getCategorie() {
        return categorie;
    }

    public Categorie categorie(Article article) {
        this.categorie = article;
        return this;
    }

    public void setCategorie(Article article) {
        this.categorie = article;
    }

    public Article getCategorie() {
        return categorie;
    }

    public Categorie categorie(Article article) {
        this.categorie = article;
        return this;
    }

    public void setCategorie(Article article) {
        this.categorie = article;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Categorie)) {
            return false;
        }
        return id != null && id.equals(((Categorie) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Categorie{" +
            "id=" + getId() +
            ", nom='" + getNom() + "'" +
            "}";
    }
}
