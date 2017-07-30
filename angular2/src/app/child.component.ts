import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
    selector: 'child',
    templateUrl: './child.component.html'
})
export class ChildComponent implements OnInit {
    @Input()
    private message: string;

    /** Output与EventEmitter搭配使用向父组件传递消息 */
    @Output() private outer = new EventEmitter<string>();

    constructor() { }

    ngOnInit() { }

    sendToParent() {
        this.outer.emit('message from child');
    }
}