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
public class ColumnXML {

    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "type")
    private String type;

    @XmlAttribute(name = "bytes")
    private String bytes;

    @XmlAttribute(name = "max_size")
    private String max_size;
}
