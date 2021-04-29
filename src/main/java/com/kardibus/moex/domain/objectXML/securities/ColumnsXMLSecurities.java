package com.kardibus.moex.domain.objectXML.securities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@NoArgsConstructor
@XmlRootElement(name = "columns")
@XmlAccessorType(XmlAccessType.FIELD)
public class ColumnsXMLSecurities {

    @XmlElementWrapper(name = "columnXMLSecuritiesList")
    @XmlElement(name = "column")
    private List<ColumnXMLSecurities> columnXMLSecuritiesList;
}
