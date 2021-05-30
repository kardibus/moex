package com.kardibus.moex.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HistoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String BOARDID;

    private Date TRADEDATE;

    private String SHORTNAME;

    private Double NUMTRADES;

    private Double VALUE;

    private Double OPEN;

    private Double LOW;

    private Double HIGH;

    private Double LEGALCLOSEPRICE;

    private Double WAPRICE;

    private Double CLOSE;

    private Double VOLUME;

    private Double MARKETPRICE2;

    private Double MARKETPRICE3;

    private Double ADMITTEDQUOTE;

    private Double MP2VALTRD;

    private Double MARKETPRICE3TRADESVALUE;

    private Double ADMITTEDVALUE;

    private Double WAVAL;

    @ManyToOne
    @JoinColumn(name = "SECID", referencedColumnName = "secid")
    private SecuritiesEntity secid;
}
