package com.example.yadong.androidapollolithosonardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;
import com.example.yadong.androidapollolithosonardemo.components.ProjectListSection;
import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.sections.SectionContext;
import com.facebook.litho.sections.widget.RecyclerCollectionComponent;

import javax.annotation.Nonnull;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ComponentContext componentContext = new ComponentContext(this);

        DemoApplication application = (DemoApplication) getApplication();
        final ApolloClient client = application.getApolloClient();
        client
            .query(ProjectListQuery.builder().build())
            .enqueue(new ApolloCall.Callback<ProjectListQuery.Data>() {

                @Override
                public void onResponse(@Nonnull Response<ProjectListQuery.Data> response) {

                    final Component component = RecyclerCollectionComponent
                        .create(componentContext)
                        .section(ProjectListSection.create(new SectionContext(componentContext)).build())
                        .build();
                    setContentView(LithoView.create(componentContext, component));
                }

                @Override
                public void onFailure(@Nonnull ApolloException e) {

                    System.out.println("AAA" + client.toString());
                }
            });


    }
}
