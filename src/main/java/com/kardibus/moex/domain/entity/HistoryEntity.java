package com.kardibus.moex.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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

    private String NUMTRADES;

    private String VALUE;

    private String OPEN;

    private String LOW;

    private String HIGH;

    private String LEGALCLOSEPRICE;

    private String WAPRICE;

    private String CLOSE;

    private String VOLUME;

    private String MARKETPRICE2;

    private String MARKETPRICE3;

    private String ADMITTEDQUOTE;

    private String MP2VALTRD;

    private String MARKETPRICE3TRADESVALUE;

    private String ADMITTEDVALUE;

    private String WAVAL;

    @ManyToOne
    @JoinColumn(name = "SECID",referencedColumnName = "secid")
    private SecuritiesEntity secid;
}
