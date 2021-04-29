package com.kardibus.moex.domain.objectXML.securities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@NoArgsConstructor
@XmlRootElement(name = "rows")
@XmlAccessorType(XmlAccessType.FIELD)
public class RowsXMLSecurities {

    @XmlElement(name = "row")
    private List<RowXMLSecurities> rowXMLSecurities;
}
