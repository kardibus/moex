package com.kardibus.moex.domain.objectXML.securities;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@XStreamAlias("rows")
public class RowsXMLSecurities {

    @XStreamImplicit(itemFieldName = "row")
    private List<RowXMLSecurities> rowXMLSecurities;
}
