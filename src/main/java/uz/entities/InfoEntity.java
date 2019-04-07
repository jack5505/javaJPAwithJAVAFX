package uz.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "info")
public class InfoEntity
{
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private BigDecimal water;

    @Column
    private BigDecimal fat;

    @Column
    private BigDecimal protein;

    @Column
    private BigDecimal sold;

    @ManyToOne
    @JoinColumn(name = "sellerId",insertable = false,updatable = false)
    private SellerEntity seller;

    @Column(name = "sellerId")
    private Long sellerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getWater() {
        return water;
    }

    public void setWater(BigDecimal water) {
        this.water = water;
    }

    public BigDecimal getFat() {
        return fat;
    }

    public void setFat(BigDecimal fat) {
        this.fat = fat;
    }

    public BigDecimal getProtein() {
        return protein;
    }

    public void setProtein(BigDecimal protein) {
        this.protein = protein;
    }

    public BigDecimal getSold() {
        return sold;
    }

    public void setSold(BigDecimal sold) {
        this.sold = sold;
    }

    public SellerEntity getSeller() {
        return seller;
    }

    public void setSeller(SellerEntity seller) {
        this.seller = seller;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }
}
