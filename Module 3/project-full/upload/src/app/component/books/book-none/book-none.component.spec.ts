import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookNoneComponent } from './book-none.component';

describe('BookNoneComponent', () => {
  let component: BookNoneComponent;
  let fixture: ComponentFixture<BookNoneComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookNoneComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookNoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
