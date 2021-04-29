package com.kardibus.moex.domain.objectXML.history;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@NoArgsConstructor
@XmlRootElement(name = "columns")
@XmlAccessorType(XmlAccessType.FIELD)
public class ColumnsXML {

    @XmlElement(name = "column")
    private List<ColumnXML> columnXMLList;
}
