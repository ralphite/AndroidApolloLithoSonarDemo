package com.example.yadong.androidapollolithosonardemo.components;

import com.facebook.litho.Column;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.annotations.LayoutSpec;
import com.facebook.litho.annotations.OnCreateLayout;
import com.facebook.litho.annotations.Prop;
import com.facebook.litho.widget.Text;

import static com.facebook.yoga.YogaEdge.ALL;

@LayoutSpec
public class ProjectListItemSpec {

    @OnCreateLayout
    static Component onCreateLayout(ComponentContext c, @Prop String projectName, @Prop int color) {

        return Column.create(c)
            .paddingDip(ALL, 16)
            .child(Text.create(c).text(projectName).textSizeSp(32))
            .child(Text.create(c).text("Task Count: 20").textSizeSp(20))
            .backgroundColor(color)
            .build();
    }
}
