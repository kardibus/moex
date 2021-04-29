package com.kardibus.moex.domain.objectXML.history;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@XStreamAlias("column")
public class ColumnCursor {

    @XStreamAlias("name")
    @XStreamAsAttribute
    private String name;

    @XStreamAlias("type")
    @XStreamAsAttribute
    private String type;
}
