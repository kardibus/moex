package com.kardibus.moex.domain.objectXML.securities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@XmlRootElement(name = "row")
public class RowCursorSecurities {

    @XmlAttribute(name = "INDEX")
    private String INDEX;

    @XmlAttribute(name = "TOTAL")
    private String TOTAL;

    @XmlAttribute(name = "PAGESIZE")
    private String PAGESIZE;
}
