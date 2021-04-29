package com.kardibus.moex.domain.objectXML.securities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@NoArgsConstructor
@XmlRootElement(name = "rows")
public class RowsCursorSecurities {

    @XmlElementWrapper(name = "rowCursorSecurities")
    @XmlElement(name = "row")
    private List<RowCursorSecurities> rowCursorSecurities;
}
