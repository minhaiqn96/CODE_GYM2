import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookDoneComponent } from './book-done.component';

describe('BookDoneComponent', () => {
  let component: BookDoneComponent;
  let fixture: ComponentFixture<BookDoneComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookDoneComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookDoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
