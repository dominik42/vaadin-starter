package de.hub28.test.views.map;

import com.vaadin.flow.component.map.Map;
import com.vaadin.flow.component.map.configuration.Coordinate;
import com.vaadin.flow.component.map.configuration.View;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import de.hub28.test.views.MainLayout;

@PageTitle("Map")
@Route(value = "map", layout = MainLayout.class)
public class MapView extends VerticalLayout {

    private Map map = new Map();

    public MapView() {
        setSizeFull();
        setPadding(false);
        map.getElement().setAttribute("theme", "borderless");
        View view = map.getView();
        view.setCenter(new Coordinate(10.0, 55.0));
        view.setZoom(4);
        addAndExpand(map);
    }
}
