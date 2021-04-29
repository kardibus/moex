package com.kardibus.moex.domain.objectXML.history;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@XStreamAlias("row")
public class RowXML {

    @XStreamAlias("BOARDID")
    @XStreamAsAttribute
    private String BOARDID;

    @XStreamAlias("TRADEDATE")
    @XStreamAsAttribute
    private String TRADEDATE;

    @XStreamAlias("SHORTNAME")
    @XStreamAsAttribute
    private String SHORTNAME;

    @XStreamAlias("SECID")
    @XStreamAsAttribute
    private String SECID;

    @XStreamAlias("NUMTRADES")
    @XStreamAsAttribute
    private String NUMTRADES;

    @XStreamAlias("VALUE")
    @XStreamAsAttribute
    private String VALUE;

    @XStreamAlias("OPEN")
    @XStreamAsAttribute
    private String OPEN;

    @XStreamAlias("LOW")
    @XStreamAsAttribute
    private String LOW;

    @XStreamAlias("HIGH")
    @XStreamAsAttribute
    private String HIGH;

    @XStreamAlias("LEGALCLOSEPRICE")
    @XStreamAsAttribute
    private String LEGALCLOSEPRICE;

    @XStreamAlias("WAPRICE")
    @XStreamAsAttribute
    private String WAPRICE;

    @XStreamAlias("CLOSE")
    @XStreamAsAttribute
    private String CLOSE;

    @XStreamAlias("VOLUME")
    @XStreamAsAttribute
    private String VOLUME;

    @XStreamAlias("MARKETPRICE2")
    @XStreamAsAttribute
    private String MARKETPRICE2;

    @XStreamAlias("MARKETPRICE3")
    @XStreamAsAttribute
    private String MARKETPRICE3;

    @XStreamAlias("ADMITTEDQUOTE")
    @XStreamAsAttribute
    private String ADMITTEDQUOTE;

    @XStreamAlias("MP2VALTRD")
    @XStreamAsAttribute
    private String MP2VALTRD;

    @XStreamAlias("MARKETPRICE3TRADESVALUE")
    @XStreamAsAttribute
    private String MARKETPRICE3TRADESVALUE;

    @XStreamAlias("ADMITTEDVALUE")
    @XStreamAsAttribute
    private String ADMITTEDVALUE;

    @XStreamAlias("WAVAL")
    @XStreamAsAttribute
    private String WAVAL;
}
