package com.kardibus.moex.domain.objectXML.history;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@XmlRootElement(name = "row")
@XmlAccessorType(XmlAccessType.FIELD)
public class RowXML {

    @XmlAttribute(name = "BOARDID")
    private String BOARDID;

    @XmlAttribute(name = "TRADEDATE")
    private String TRADEDATE;

    @XmlAttribute(name = "SHORTNAME")
    private String SHORTNAME;

    @XmlAttribute(name = "SECID")
    private String SECID;

    @XmlAttribute(name = "NUMTRADES")
    private String NUMTRADES;

    @XmlAttribute(name = "VALUE")
    private String VALUE;

    @XmlAttribute(name = "OPEN")
    private String OPEN;

    @XmlAttribute(name = "LOW")
    private String LOW;

    @XmlAttribute(name = "HIGH")
    private String HIGH;

    @XmlAttribute(name = "LEGALCLOSEPRICE")
    private String LEGALCLOSEPRICE;

    @XmlAttribute(name = "WAPRICE")
    private String WAPRICE;

    @XmlAttribute(name = "CLOSE")
    private String CLOSE;

    @XmlAttribute(name = "VOLUME")
    private String VOLUME;

    @XmlAttribute(name = "MARKETPRICE2")
    private String MARKETPRICE2;

    @XmlAttribute(name = "MARKETPRICE3")
    private String MARKETPRICE3;

    @XmlAttribute(name = "ADMITTEDQUOTE")
    private String ADMITTEDQUOTE;

    @XmlAttribute(name = "MP2VALTRD")
    private String MP2VALTRD;

    @XmlAttribute(name = "MARKETPRICE3TRADESVALUE")
    private String MARKETPRICE3TRADESVALUE;

    @XmlAttribute(name = "ADMITTEDVALUE")
    private String ADMITTEDVALUE;

    @XmlAttribute(name = "WAVAL")
    private String WAVAL;
}
