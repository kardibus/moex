package com.kardibus.moex.domain.objectXML.securities;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XStreamAlias("row")
public class RowXMLSecurities {

    @XStreamAlias("id")
    @XStreamAsAttribute
    private String id;

    @XStreamAlias("secid")
    @XStreamAsAttribute
    private String secid;

    @XStreamAlias("shortname")
    @XStreamAsAttribute
    private String shortname;

    @XStreamAlias("regnumber")
    @XStreamAsAttribute
    private String regnumber;

    @XStreamAlias("name")
    @XStreamAsAttribute
    private String name;

    @XStreamAlias("isin")
    @XStreamAsAttribute
    private String isin;

    @XStreamAlias(value = "emitent_id")
    @XStreamAsAttribute
    private String emitent_id;

    @XStreamAlias(value = "emitent_title")
    @XStreamAsAttribute
    private String emitent_title;

    @XStreamAlias(value = "emitent_inn")
    @XStreamAsAttribute
    private String emitent_inn;

    @XStreamAlias(value = "emitent_okpo")
    @XStreamAsAttribute
    private String emitent_okpo;

    @XStreamAlias("gosreg")
    @XStreamAsAttribute
    private String gosreg;

    @XStreamAlias("type")
    @XStreamAsAttribute
    private String type;

    @XStreamAlias("group")
    @XStreamAsAttribute
    private String group;

    @XStreamAlias(value = "primary_boardid")
    @XStreamAsAttribute
    private String primary_boardid;

    @XStreamAlias(value = "marketprice_boardid")
    @XStreamAsAttribute
    private String marketprice_boardid;

    @XStreamAlias(value = "is_traded")
    @XStreamAsAttribute
    private String is_traded;
}
