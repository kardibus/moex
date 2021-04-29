package com.kardibus.moex.domain.objectXML.history;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@XStreamAlias("columns")
public class ColumnsXML {

    @XStreamImplicit(itemFieldName = "column")
    private List<ColumnXML> columnXMLList;
}
