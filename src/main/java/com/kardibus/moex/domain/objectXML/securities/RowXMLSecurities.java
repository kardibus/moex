package com.kardibus.moex.domain.objectXML.securities;


import com.kardibus.moex.domain.objectXML.adapter.AdapterInt;
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
public class RowXMLSecurities {

    @XmlAttribute
    private String id;
    @XmlAttribute
    private String secid;
    @XmlAttribute
    private String shortname;
    @XmlAttribute
    private String regnumber;
    @XmlAttribute
    private String name;
    @XmlAttribute
    private String isin;
    @XmlAttribute(name = "emitent_id")
    @XmlJavaTypeAdapter(AdapterInt.class)
    private String emitent_id;
    @XmlAttribute(name = "emitent_title")
    private String emitent_title;
    @XmlAttribute(name = "emitent_inn")
    private String emitent_inn;
    @XmlAttribute(name = "emitent_okpo")
    private String emitent_okpo;
    @XmlAttribute
    private String gosreg;
    @XmlAttribute
    private String type;
    @XmlAttribute
    private String group;
    @XmlAttribute(name = "primary_boardid")
    private String primary_boardid;
    @XmlAttribute(name = "marketprice_boardid")
    private String marketprice_boardid;
    @XmlAttribute(name = "is_traded")
    private String is_traded;


}
