package com.kardibus.moex.domain.objectXML.securities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@XmlRootElement(name = "column")
@XmlAccessorType(XmlAccessType.FIELD)
public class ColumnCursorSecurities {

    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "type")
    private String type;
}
