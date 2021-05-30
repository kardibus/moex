package com.kardibus.moex.domain.objectXML.history;

import com.kardibus.moex.domain.objectXML.adapter.AdapterString;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
    @XmlJavaTypeAdapter(AdapterString.class)
    private String NUMTRADES;

    @XmlAttribute(name = "VALUE")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String VALUE;

    @XmlAttribute(name = "OPEN")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String OPEN;

    @XmlAttribute(name = "LOW")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String LOW;

    @XmlAttribute(name = "HIGH")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String HIGH;

    @XmlAttribute(name = "LEGALCLOSEPRICE")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String LEGALCLOSEPRICE;

    @XmlAttribute(name = "WAPRICE")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String WAPRICE;

    @XmlAttribute(name = "CLOSE")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String CLOSE;

    @XmlAttribute(name = "VOLUME")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String VOLUME;

    @XmlAttribute(name = "MARKETPRICE2")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String MARKETPRICE2;

    @XmlAttribute(name = "MARKETPRICE3")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String MARKETPRICE3;

    @XmlAttribute(name = "ADMITTEDQUOTE")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String ADMITTEDQUOTE;

    @XmlAttribute(name = "MP2VALTRD")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String MP2VALTRD;

    @XmlAttribute(name = "MARKETPRICE3TRADESVALUE")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String MARKETPRICE3TRADESVALUE;

    @XmlAttribute(name = "ADMITTEDVALUE")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String ADMITTEDVALUE;

    @XmlAttribute(name = "WAVAL")
    @XmlJavaTypeAdapter(AdapterString.class)
    private String WAVAL;
}
