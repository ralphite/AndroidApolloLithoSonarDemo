package com.example.yadong.androidapollolithosonardemo.components;

import com.facebook.litho.sections.Children;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.annotations.GroupSectionSpec;
import com.facebook.litho.sections.annotations.OnCreateChildren;
import com.facebook.litho.sections.common.SingleComponentSection;
import com.facebook.litho.widget.Text;

@GroupSectionSpec
public class ProjectListSectionSpec {


    @OnCreateChildren
    static Children onCreateChildren(final SectionContext sectionContext) {
        return Children.create()
                .child(SingleComponentSection.create(sectionContext).component(
                        Text.create(sectionContext).text("hello world").textSizeSp(20).build()
                ).build())
                .build();
    }
}
