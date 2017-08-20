import { Component } from '@angular/core';
import { heroServiceProvider } from "./hero.service.provider";
import { HeroService } from "./hero.service";
import {Logger} from  "../log/logger.service"

@Component({
    selector: 'my-heros',
    providers: [Logger, HeroService],
    template: `
    <h2>Heroes</h2>
    <hero-list></hero-list>
    `
})
export class HerosComponent {
    constructor() { }
}