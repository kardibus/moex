package com.kardibus.moex.domain.objectXML.securities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@NoArgsConstructor
@XmlRootElement(name = "document")
@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentXMLSecurities {

    @XmlElement(name = "data")
    private List<DataXMLSecurities> dataXMLSecurities;
}
