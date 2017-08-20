import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppRoutingModule } from './app-routing.module';

// Imports for loading & configuring the in-memory web api
import { InMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService } from './mock/in-memory-data.service';

import { AppComponent } from './app.component';
import { HeroesComponent } from './hero/heroes.component';
import { HeroDetailComponent } from './hero/hero-detail.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HeroSearchComponent } from './hero/hero-search.component';
import { HeroService } from './hero/hero.service';
//form-demo
import { HeroFormComponent } from "./form-demo/hero-form.component";


@NgModule({
  declarations: [
    AppComponent,
    HeroesComponent,
    HeroDetailComponent,
    DashboardComponent,
    HeroSearchComponent,
    HeroFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpModule,
    InMemoryWebApiModule.forRoot(InMemoryDataService)
  ],
  providers: [HeroService],
  bootstrap: [AppComponent]
})
export class AppModule { }
