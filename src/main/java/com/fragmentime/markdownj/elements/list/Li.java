package com.fragmentime.markdownj.elements.list;

import com.fragmentime.markdownj.elements.Element;

/**
 * Created by Beancan on 2016/10/28.
 */
public class Li extends Element {

    public Li() {
        setType(Element.LI);
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>");
        if (this.hasRight()) {
            sb.append(this.getRight().render());
        } else {
            String data = this.getData().get(0).trim();
            sb.append(data);
        }
        sb.append("</li>").append("\n");
        if (this.hasLeft()) {
            sb.append(this.getLeft().render());
        }
        return sb.toString();
    }
}
