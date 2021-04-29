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
public class RowCursor {

    @XmlAttribute(name = "INDEX")
    private String INDEX;

    @XmlAttribute(name = "TOTAL")
    private String TOTAL;

    @XmlAttribute(name = "PAGESIZE")
    private String PAGESIZE;
}
