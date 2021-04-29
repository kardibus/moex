package com.kardibus.moex.domain.objectXML.history;

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
public class ColumnCursor {

    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "type")
    private String type;
}
