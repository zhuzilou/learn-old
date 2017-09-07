import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';

import { InjectComponent } from './inject.component';

// const routes: Routes = [
//     { path: '', component: HeroesComponent }
// ];

export const injectRoutes = [
    {
        path:'',
        component: InjectComponent
    }
];
