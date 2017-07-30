import { Directive, ElementRef, Renderer } from '@angular/core';

/** 自定义指令 */
@Directive({
    selector: '[highlight]',
})
export class HighlightDirective {
    constructor(el: ElementRef, render: Renderer) {
        render.setElementStyle(el.nativeElement, 'backgroundColor', 'yellow');
    }
}