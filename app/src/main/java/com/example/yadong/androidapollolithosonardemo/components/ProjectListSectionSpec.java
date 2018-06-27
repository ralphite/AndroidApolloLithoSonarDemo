package com.example.yadong.androidapollolithosonardemo.components;

import com.facebook.litho.annotations.FromEvent;
import com.facebook.litho.annotations.OnEvent;
import com.facebook.litho.sections.Children;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.annotations.GroupSectionSpec;
import com.facebook.litho.sections.annotations.OnCreateChildren;
import com.facebook.litho.sections.common.DataDiffSection;
import com.facebook.litho.sections.common.RenderEvent;
import com.facebook.litho.widget.ComponentRenderInfo;
import com.facebook.litho.widget.RenderInfo;

import java.util.ArrayList;
import java.util.Arrays;

@GroupSectionSpec
public class ProjectListSectionSpec {

  @OnCreateChildren
  static Children onCreateChildren(final SectionContext sectionContext) {
    return Children.create()
        .child(
            DataDiffSection.create(sectionContext)
                .data(new ArrayList<Object>(Arrays.asList("GraphQL", "Relay")))
                .renderEventHandler(ProjectListSection.onRender(sectionContext)))
        .build();
  }

  @OnEvent(RenderEvent.class)
  static RenderInfo onRender(final SectionContext c, @FromEvent String model) {
    return ComponentRenderInfo.create()
        .component(ProjectListItem.create(c).projectName(model).build())
        .build();
  }
}
