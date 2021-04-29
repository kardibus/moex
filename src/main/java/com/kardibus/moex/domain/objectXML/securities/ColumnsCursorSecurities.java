package com.kardibus.moex.domain.objectXML.securities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.List;

@Data
@NoArgsConstructor
@XmlRootElement(name = "columns")
@XmlAccessorType(XmlAccessType.FIELD)
public class ColumnsCursorSecurities {

    @XmlElementWrapper(name = "columnCursorSecurities")
    @XmlElement(name = "column")
    private List<ColumnCursorSecurities> columnCursorSecurities;
}
