import { Component } from '@angular/core';

import { Hero } from './hero';

@Component({
    selector: 'hero-form',
    templateUrl: './hero-form.component.html',
    styleUrls: ['./hero-form.component.css']
})
export class HeroFormComponent {

    powers = ['Really Smart', 'Super Flexible',
        'Super Hot', 'Weather Changer'];

    model = new Hero(18, 'Dr IQ', this.powers[0], 'Chuck Overstreet');

    submitted = false;

    onSubmit() {
        this.submitted = true;
        console.log("onSubmit(): " + this.model.name);
        console.log("onSubmit(): " + this.model.power);
        console.log("onSubmit(): " + this.submitted);
    }

    // TODO: Remove this when we're done
    get diagnostic() { return JSON.stringify(this.model); }

    newHero() {
        this.model = new Hero(42, '', '');
        console.log("newHero(): " + this.submitted);
    }
}