import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';
//hero
import { HeroesComponent } from "./hero/heroes.component";
import { HeroListComponent } from "./hero/hero-list.component";
import { InjectComponent } from "./inject.component";
import { injectRoutes } from "./inject.routes";

import { Logger } from "./log/logger.service";
import { UserService } from "./user/user.service";
import { HeroService } from "./hero/hero.service";

@NgModule({
    declarations: [InjectComponent, HeroesComponent, HeroListComponent],
    imports: [CommonModule,
        RouterModule.forChild(injectRoutes)
    ],
    exports: [],
    providers: [
        //注册模块中需要用到的服务，如果只是单纯在某个组件中使用，可以只在该组件中注册，例如HeroesComponent中注册的heroServiceProvider。
        Logger, UserService, HeroService],
})
export class InjectModule { }